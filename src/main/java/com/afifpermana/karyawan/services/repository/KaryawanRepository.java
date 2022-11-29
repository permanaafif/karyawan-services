/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.afifpermana.karyawan.services.repository;

import com.afifpermana.karyawan.services.entity.Karyawan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Apip
 */
@Repository
public interface KaryawanRepository extends JpaRepository<Karyawan, Long>{
    public Karyawan findByKaryawanId(Long karyawanId);
}
