//package com.photobox.iways.product.catalog.iwaysproductcatalog.domain;
//
//import java.util.HashSet;
//import java.util.Set;
//
////@Entity
////@Table(name = "CATLG_PRODUCT")
////@AttributeOverrides({@AttributeOverride(name = "id", column = @Column(name = "ID_PRODUCT"))})
//public class CovenantProduct extends BaseCatalogEntity {
//
//    private static final long serialVersionUID = 2391467579676696567L;
//
//    /**
//     * the options available for the product
//     */
//    @ManyToMany(fetch = FetchType.EAGER, cascade = {CascadeType.ALL})
//    @JoinTable(name = "CATLG_PRODUCT_OPTION", joinColumns = {
//            @JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT")}, inverseJoinColumns = {
//            @JoinColumn(name = "ID_OPTION", referencedColumnName = "ID_OPTION")})
//    private Set<CovenantOption> options;
//
//    /**
//     * the existing variants of the product
//     */
//    @OneToMany(mappedBy = "product", cascade = {CascadeType.ALL}, orphanRemoval = true)
//    private Set<ProductVariant> variants;
//
//    /**
//     * the brands that sell the product
//     */
//    // @OnDelete(action = OnDeleteAction.CASCADE)
//    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
//    @JoinTable(name = "CATLG_PRODUCT_BRAND", joinColumns = {@JoinColumn(name = "ID_PRODUCT", referencedColumnName = "ID_PRODUCT")}, inverseJoinColumns = {@JoinColumn(name = "ID_BRAND", referencedColumnName = "ID_BRAND")})
//    private Set<Brand> brands;
//
//    @Column(name = "NAME", nullable = false)
//    private String name;
//
//    @Column(name = "DESCRIPTION")
//    private String description;
//
//    /**
//     * the product code. This code will be used by third parties in API calls
//     */
//    @Column(name = "CODE", unique = true, nullable = false, length = 40)
//    private String code;
//
//    /**
//     * the product SKU
//     */
//    @Column(name = "SKU", unique = true, length = 255, nullable = false)
//    private String sku;
//
//    /**
//     * URL of the product image
//     */
//    @Column(name = "IMAGE", length = 1024)
//    private String image;
//
//    /**
//     * Product length
//     */
//    @Column(name = "LENGTH", precision = 10, scale = 2)
//    private Float length;
//
//    /**
//     * Product width
//     */
//    @Column(name = "WIDTH", precision = 10, scale = 2)
//    private Float width;
//
//    /**
//     * Product height
//     */
//    @Column(name = "HEIGHT", precision = 10, scale = 2)
//    private Float height;
//
//    /**
//     * Define whether the product is personalized or not
//     */
//    @Column(name = "PERSONALIZED", nullable = false)
//    private Boolean personalized;
//
//    /**
//     * Define whether the product is disabled or not
//     */
//    @Column(name = "AVAILABLE", nullable = false)
//    private Boolean available;
//
//    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
//    @JoinTable(name = "CATLG_COMPATIBLE_PRODUCT", joinColumns = {
//            @JoinColumn(name = "ID_PRODUCT")}, inverseJoinColumns = {
//            @JoinColumn(name = "ID_COMPATIBLE_PRODUCT")})
//    private Set<CovenantProduct> compatibleProducts;
//
//    @OneToMany(mappedBy = "product", cascade = {
//            CascadeType.ALL}, fetch = FetchType.EAGER, orphanRemoval = true)
//    private Set<Facet> facets;
//
//    /**
//     * Default constructor for {@link CovenantProduct}
//     */
//    public CovenantProduct() {
//        super();
//        this.options = new HashSet<CovenantOption>();
//        this.variants = new HashSet<ProductVariant>();
//        this.brands = new HashSet<Brand>();
//        this.name = null;
//        this.description = null;
//        this.code = null;
//        this.sku = null;
//        this.image = null;
//        this.width = null;
//        this.height = null;
//        this.length = null;
//        this.personalized = true;
//        this.available = true;
//        this.compatibleProducts = new HashSet<CovenantProduct>();
//        this.facets = new HashSet<Facet>();
//    }
//}
//
