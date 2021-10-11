package za.ac.nwu.ac.domain.dto;

import java.time.LocalDate;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import za.ac.nwu.ac.domain.persistence.AccountType;
import com.fasterxml.jackson.annotation.JsonIgnore;


@ApiModel
(value = "AccountType", description = "A Dto that represents the AccountType")

public class AccountTypeDto {

    private static long serialVersionUID = 4L;
    private String mnemonic;
    private String accountTypeName;

    public AccountTypeDto()
    {

    }
    public AccountTypeDto(String mnemonic, String accountTypeName)
    {
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
    }



    public void setMnemonic(String mnemonic) {
        this.mnemonic = mnemonic;
    }

    public void setAccountName(String AccountTypeName)
    {
        this.accountTypeName = accountTypeName;
    }


    @ApiModelProperty(position = 1,
            value = "AccountType mnemonic",
            name = "mnemonic",
            notes = "Uniquely identifiers the account type",
            dataType = "Java.lang.String",
            example = "MILES",
            required = true)
    public String getMnemonic() {
        return mnemonic;
    }

    @ApiModelProperty(position = 2,
            value = "AccountType Name",
            name = "AccountTypeName",
            notes = "the account type name",
            dataType = "Java.lang.String",
            example = "MILES",
            allowEmptyValue = false,
            required = true)
    public String getAccountTypeName() {
        return accountTypeName;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o)
        {
            return true;
        }
        if (o == null || getClass() != o.getClass())
        {
            return false;
        }
        AccountTypeDto that = (AccountTypeDto) o;
        return Objects.equals(mnemonic,that.mnemonic) && Objects.equals(accountTypeName, that.accountTypeName);


    }
    @JsonIgnore
    public AccountType getAccountType() {
        return new AccountType (getMnemonic(),getAccountTypeName());
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(mnemonic,accountTypeName);
    }
    @Override
    public String toString()
    {
        return "AccountTypeDto{" +
                "mnemonic= " +mnemonic+ '\''+
                ",accountTypeName= " +accountTypeName+
                '}';

    }


}
