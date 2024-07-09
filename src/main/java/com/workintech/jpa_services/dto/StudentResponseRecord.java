package com.workintech.jpa_services.dto;

//dto => fieldların tümünü değil belli kısmını getirmek için data tutan paketler
//record getter methodları vardır, dto için uygundur. Set edilmez

//Controller paketine git!!!
public record StudentResponseRecord(String firstName, String lastName) {
}
