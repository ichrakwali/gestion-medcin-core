/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
<<<<<<< HEAD
 *//*
=======
 */
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
package com.csys.template.repository;

import com.csys.template.Entity.CertificatMedical;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Dell
<<<<<<< HEAD

=======
 */
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
public interface CertificatMedicalRepository extends JpaRepository<CertificatMedical, Integer>{ 
    

    public CertificatMedical findByIdcertificat(Integer id);
       public CertificatMedical save (CertificatMedical certificatMedical);

}
<<<<<<< HEAD
*/
=======
>>>>>>> 41fdbb6895f2341fb31a351233b924053da3133d
