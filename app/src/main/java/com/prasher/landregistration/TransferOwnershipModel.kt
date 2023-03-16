package com.prasher.landregistration

class TransferOwnershipModel(
    private var landID :Int,
    private var sellerAddress : String,
    private var buyerAddress : String,
    private var paymentStatus : String
) {
    fun getLandID() : Int{
        return landID
    }
    fun getSellerAddress() : String{
        return sellerAddress
    }
    fun getBuyerAddress() : String{
        return buyerAddress
    }
    fun getPaymentStatus() : String{
        return paymentStatus
    }
    fun setLandID(landID: Int){
        this.landID=landID
    }
    fun setSellerAddress(sellerAddress: String){
        this.sellerAddress = sellerAddress
    }
    fun setBuyerAddress(buyerAddress: String){
        this.buyerAddress = buyerAddress
    }
    fun setPaymentStatus(paymentStatus: String){
        this.paymentStatus = paymentStatus
    }


}