package cn.edu.xmu.javaee.productdemoaop.mapper.generator;

import cn.edu.xmu.javaee.productdemoaop.mapper.generator.po.ProductPo;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductPoMapper_Jpa extends JpaRepository<ProductPo, Long> {


    List<ProductPo> findByName(String name);
}
