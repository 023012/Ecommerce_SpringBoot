package com.ecommerce.library.service;

import com.ecommerce.library.dto.AdminDto;
import com.ecommerce.library.entity.Admin;



public interface AdminService {
    Admin findByUsername(String username);

    Admin save(AdminDto adminDto);
}
