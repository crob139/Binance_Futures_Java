package com.binance.client.model.trade;

import com.binance.client.constant.BinanceApiConstants;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.math.BigDecimal;

public class AccountBalanceV2 {
	
	private String accountAlias;
	
    private String asset;

    private BigDecimal balance;

    private BigDecimal crossWalletBalance;
    
    private BigDecimal crossUnPnl;
    
    private BigDecimal availableBalance;
    
    private BigDecimal maxWithdrawAmount;
    
    public String getAccountAlias() {
        return accountAlias;
    }

    public void setAccountAlias(String accountAlias) {
        this.accountAlias = accountAlias;
    }
    
    public String getAsset() {
        return asset;
    }

    public void setAsset(String asset) {
        this.asset = asset;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
    
    public BigDecimal getCrossWalletBalance() {
        return crossWalletBalance;
    }

    public void setCrossWalletBalance(BigDecimal crossWalletBalance) {
        this.crossWalletBalance = crossWalletBalance;
    }
    
    public BigDecimal getCrossUnPnl() {
        return crossUnPnl;
    }

    public void setCrossUnPnl(BigDecimal crossUnPnl) {
        this.crossUnPnl = crossUnPnl;
    }
    
    public BigDecimal getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(BigDecimal availableBalance) {
        this.availableBalance = availableBalance;
    }
    
    public BigDecimal getMaxWithdrawAmount() {
        return maxWithdrawAmount;
    }

    public void setMaxWithdrawAmount(BigDecimal maxWithdrawAmount) {
        this.maxWithdrawAmount = maxWithdrawAmount;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, BinanceApiConstants.TO_STRING_BUILDER_STYLE).append("accountAlias", accountAlias)
        		.append("asset", asset).append("balance", balance).append("crossWalletBalance", crossWalletBalance)
        		.append("crossUnPnl", crossUnPnl).append("availableBalance", availableBalance).append("maxWithdrawAmount", maxWithdrawAmount)
                .toString();
    }
}
