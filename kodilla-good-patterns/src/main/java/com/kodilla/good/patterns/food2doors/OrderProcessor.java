package com.kodilla.good.patterns.food2doors;

public class OrderProcessor {

private OrderDTO orderDTO;
private OrderItem orderItem;
private SearchProduct searchProduct;
private OrderRetriever orderRetriever;
private Shop shop;

    public OrderProcessor(final SearchProduct searchProduct, final OrderRetriever orderRetriever) {
        //this.orderDTO = orderDTO;
        this.searchProduct = searchProduct;
        this.orderRetriever = orderRetriever;
    }

    public SearchProduct getSearchProduct() {
        return searchProduct;
    }

    public OrderRetriever getOrderRetriever() {
        return orderRetriever;
    }

    public void process(){
        try {
            OrderItem searchItem = searchProduct.searchProduct();
            OrderDTO orderDTO = orderRetriever.searchInventory(searchItem);
            Shop shop = (Shop) orderDTO.getShop();
            shop.process(searchItem);
        } catch (NoInventory noInventory) {
            System.out.println("No order match");
        }


    }
}
