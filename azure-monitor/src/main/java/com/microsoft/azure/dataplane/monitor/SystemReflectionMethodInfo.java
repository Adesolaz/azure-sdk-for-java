/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.dataplane.monitor;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The SystemReflectionMethodInfo model.
 */
public class SystemReflectionMethodInfo {
    /**
     * Possible values include: 'Constructor', 'Event', 'Field', 'Method',
     * 'Property', 'TypeInfo', 'Custom', 'NestedType', 'All'.
     */
    @JsonProperty(value = "MemberType")
    private String memberType;

    /**
     * The returnType property.
     */
    @JsonProperty(value = "ReturnType")
    private SystemType returnType;

    /**
     * The returnParameter property.
     */
    @JsonProperty(value = "ReturnParameter")
    private SystemReflectionParameterInfo returnParameter;

    /**
     * The returnTypeCustomAttributes property.
     */
    @JsonProperty(value = "ReturnTypeCustomAttributes")
    private Object returnTypeCustomAttributes;

    /**
     * Possible values include: 'Managed', 'IL', 'Native', 'OPTIL', 'Runtime',
     * 'CodeTypeMask', 'Unmanaged', 'ManagedMask', 'NoInlining', 'ForwardRef',
     * 'Synchronized', 'NoOptimization', 'PreserveSig', 'AggressiveInlining',
     * 'InternalCall', 'MaxMethodImplVal'.
     */
    @JsonProperty(value = "MethodImplementationFlags")
    private String methodImplementationFlags;

    /**
     * The methodHandle property.
     */
    @JsonProperty(value = "MethodHandle")
    private SystemRuntimeMethodHandle methodHandle;

    /**
     * Possible values include: 'ReuseSlot', 'PrivateScope', 'Private',
     * 'FamANDAssem', 'Assembly', 'Family', 'FamORAssem', 'Public',
     * 'MemberAccessMask', 'UnmanagedExport', 'Static', 'Final', 'Virtual',
     * 'HideBySig', 'NewSlot', 'VtableLayoutMask', 'CheckAccessOnOverride',
     * 'Abstract', 'SpecialName', 'RTSpecialName', 'PinvokeImpl',
     * 'HasSecurity', 'RequireSecObject', 'ReservedMask'.
     */
    @JsonProperty(value = "Attributes")
    private String attributes;

    /**
     * Possible values include: 'Standard', 'VarArgs', 'Any', 'HasThis',
     * 'ExplicitThis'.
     */
    @JsonProperty(value = "CallingConvention")
    private String callingConvention;

    /**
     * The isGenericMethodDefinition property.
     */
    @JsonProperty(value = "IsGenericMethodDefinition")
    private Boolean isGenericMethodDefinition;

    /**
     * The containsGenericParameters property.
     */
    @JsonProperty(value = "ContainsGenericParameters")
    private Boolean containsGenericParameters;

    /**
     * The isGenericMethod property.
     */
    @JsonProperty(value = "IsGenericMethod")
    private Boolean isGenericMethod;

    /**
     * The isSecurityCritical property.
     */
    @JsonProperty(value = "IsSecurityCritical")
    private Boolean isSecurityCritical;

    /**
     * The isSecuritySafeCritical property.
     */
    @JsonProperty(value = "IsSecuritySafeCritical")
    private Boolean isSecuritySafeCritical;

    /**
     * The isSecurityTransparent property.
     */
    @JsonProperty(value = "IsSecurityTransparent")
    private Boolean isSecurityTransparent;

    /**
     * The isPublic property.
     */
    @JsonProperty(value = "IsPublic")
    private Boolean isPublic;

    /**
     * The isPrivate property.
     */
    @JsonProperty(value = "IsPrivate")
    private Boolean isPrivate;

    /**
     * The isFamily property.
     */
    @JsonProperty(value = "IsFamily")
    private Boolean isFamily;

    /**
     * The isAssembly property.
     */
    @JsonProperty(value = "IsAssembly")
    private Boolean isAssembly;

    /**
     * The isFamilyAndAssembly property.
     */
    @JsonProperty(value = "IsFamilyAndAssembly")
    private Boolean isFamilyAndAssembly;

    /**
     * The isFamilyOrAssembly property.
     */
    @JsonProperty(value = "IsFamilyOrAssembly")
    private Boolean isFamilyOrAssembly;

    /**
     * The isStatic property.
     */
    @JsonProperty(value = "IsStatic")
    private Boolean isStatic;

    /**
     * The isFinal property.
     */
    @JsonProperty(value = "IsFinal")
    private Boolean isFinal;

    /**
     * The isVirtual property.
     */
    @JsonProperty(value = "IsVirtual")
    private Boolean isVirtual;

    /**
     * The isHideBySig property.
     */
    @JsonProperty(value = "IsHideBySig")
    private Boolean isHideBySig;

    /**
     * The isAbstract property.
     */
    @JsonProperty(value = "IsAbstract")
    private Boolean isAbstract;

    /**
     * The isSpecialName property.
     */
    @JsonProperty(value = "IsSpecialName")
    private Boolean isSpecialName;

    /**
     * The isConstructor property.
     */
    @JsonProperty(value = "IsConstructor")
    private Boolean isConstructor;

    /**
     * The name property.
     */
    @JsonProperty(value = "Name")
    private String name;

    /**
     * The declaringType property.
     */
    @JsonProperty(value = "DeclaringType")
    private SystemType declaringType;

    /**
     * The reflectedType property.
     */
    @JsonProperty(value = "ReflectedType")
    private SystemType reflectedType;

    /**
     * The customAttributes property.
     */
    @JsonProperty(value = "CustomAttributes")
    private List<SystemReflectionCustomAttributeData> customAttributes;

    /**
     * The metadataToken property.
     */
    @JsonProperty(value = "MetadataToken")
    private Integer metadataToken;

    /**
     * The module property.
     */
    @JsonProperty(value = "Module")
    private SystemReflectionModule module;

    /**
     * Get possible values include: 'Constructor', 'Event', 'Field', 'Method', 'Property', 'TypeInfo', 'Custom', 'NestedType', 'All'.
     *
     * @return the memberType value
     */
    public String memberType() {
        return this.memberType;
    }

    /**
     * Set possible values include: 'Constructor', 'Event', 'Field', 'Method', 'Property', 'TypeInfo', 'Custom', 'NestedType', 'All'.
     *
     * @param memberType the memberType value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withMemberType(String memberType) {
        this.memberType = memberType;
        return this;
    }

    /**
     * Get the returnType value.
     *
     * @return the returnType value
     */
    public SystemType returnType() {
        return this.returnType;
    }

    /**
     * Set the returnType value.
     *
     * @param returnType the returnType value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withReturnType(SystemType returnType) {
        this.returnType = returnType;
        return this;
    }

    /**
     * Get the returnParameter value.
     *
     * @return the returnParameter value
     */
    public SystemReflectionParameterInfo returnParameter() {
        return this.returnParameter;
    }

    /**
     * Set the returnParameter value.
     *
     * @param returnParameter the returnParameter value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withReturnParameter(SystemReflectionParameterInfo returnParameter) {
        this.returnParameter = returnParameter;
        return this;
    }

    /**
     * Get the returnTypeCustomAttributes value.
     *
     * @return the returnTypeCustomAttributes value
     */
    public Object returnTypeCustomAttributes() {
        return this.returnTypeCustomAttributes;
    }

    /**
     * Set the returnTypeCustomAttributes value.
     *
     * @param returnTypeCustomAttributes the returnTypeCustomAttributes value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withReturnTypeCustomAttributes(Object returnTypeCustomAttributes) {
        this.returnTypeCustomAttributes = returnTypeCustomAttributes;
        return this;
    }

    /**
     * Get possible values include: 'Managed', 'IL', 'Native', 'OPTIL', 'Runtime', 'CodeTypeMask', 'Unmanaged', 'ManagedMask', 'NoInlining', 'ForwardRef', 'Synchronized', 'NoOptimization', 'PreserveSig', 'AggressiveInlining', 'InternalCall', 'MaxMethodImplVal'.
     *
     * @return the methodImplementationFlags value
     */
    public String methodImplementationFlags() {
        return this.methodImplementationFlags;
    }

    /**
     * Set possible values include: 'Managed', 'IL', 'Native', 'OPTIL', 'Runtime', 'CodeTypeMask', 'Unmanaged', 'ManagedMask', 'NoInlining', 'ForwardRef', 'Synchronized', 'NoOptimization', 'PreserveSig', 'AggressiveInlining', 'InternalCall', 'MaxMethodImplVal'.
     *
     * @param methodImplementationFlags the methodImplementationFlags value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withMethodImplementationFlags(String methodImplementationFlags) {
        this.methodImplementationFlags = methodImplementationFlags;
        return this;
    }

    /**
     * Get the methodHandle value.
     *
     * @return the methodHandle value
     */
    public SystemRuntimeMethodHandle methodHandle() {
        return this.methodHandle;
    }

    /**
     * Set the methodHandle value.
     *
     * @param methodHandle the methodHandle value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withMethodHandle(SystemRuntimeMethodHandle methodHandle) {
        this.methodHandle = methodHandle;
        return this;
    }

    /**
     * Get possible values include: 'ReuseSlot', 'PrivateScope', 'Private', 'FamANDAssem', 'Assembly', 'Family', 'FamORAssem', 'Public', 'MemberAccessMask', 'UnmanagedExport', 'Static', 'Final', 'Virtual', 'HideBySig', 'NewSlot', 'VtableLayoutMask', 'CheckAccessOnOverride', 'Abstract', 'SpecialName', 'RTSpecialName', 'PinvokeImpl', 'HasSecurity', 'RequireSecObject', 'ReservedMask'.
     *
     * @return the attributes value
     */
    public String attributes() {
        return this.attributes;
    }

    /**
     * Set possible values include: 'ReuseSlot', 'PrivateScope', 'Private', 'FamANDAssem', 'Assembly', 'Family', 'FamORAssem', 'Public', 'MemberAccessMask', 'UnmanagedExport', 'Static', 'Final', 'Virtual', 'HideBySig', 'NewSlot', 'VtableLayoutMask', 'CheckAccessOnOverride', 'Abstract', 'SpecialName', 'RTSpecialName', 'PinvokeImpl', 'HasSecurity', 'RequireSecObject', 'ReservedMask'.
     *
     * @param attributes the attributes value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withAttributes(String attributes) {
        this.attributes = attributes;
        return this;
    }

    /**
     * Get possible values include: 'Standard', 'VarArgs', 'Any', 'HasThis', 'ExplicitThis'.
     *
     * @return the callingConvention value
     */
    public String callingConvention() {
        return this.callingConvention;
    }

    /**
     * Set possible values include: 'Standard', 'VarArgs', 'Any', 'HasThis', 'ExplicitThis'.
     *
     * @param callingConvention the callingConvention value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withCallingConvention(String callingConvention) {
        this.callingConvention = callingConvention;
        return this;
    }

    /**
     * Get the isGenericMethodDefinition value.
     *
     * @return the isGenericMethodDefinition value
     */
    public Boolean isGenericMethodDefinition() {
        return this.isGenericMethodDefinition;
    }

    /**
     * Set the isGenericMethodDefinition value.
     *
     * @param isGenericMethodDefinition the isGenericMethodDefinition value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsGenericMethodDefinition(Boolean isGenericMethodDefinition) {
        this.isGenericMethodDefinition = isGenericMethodDefinition;
        return this;
    }

    /**
     * Get the containsGenericParameters value.
     *
     * @return the containsGenericParameters value
     */
    public Boolean containsGenericParameters() {
        return this.containsGenericParameters;
    }

    /**
     * Set the containsGenericParameters value.
     *
     * @param containsGenericParameters the containsGenericParameters value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withContainsGenericParameters(Boolean containsGenericParameters) {
        this.containsGenericParameters = containsGenericParameters;
        return this;
    }

    /**
     * Get the isGenericMethod value.
     *
     * @return the isGenericMethod value
     */
    public Boolean isGenericMethod() {
        return this.isGenericMethod;
    }

    /**
     * Set the isGenericMethod value.
     *
     * @param isGenericMethod the isGenericMethod value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsGenericMethod(Boolean isGenericMethod) {
        this.isGenericMethod = isGenericMethod;
        return this;
    }

    /**
     * Get the isSecurityCritical value.
     *
     * @return the isSecurityCritical value
     */
    public Boolean isSecurityCritical() {
        return this.isSecurityCritical;
    }

    /**
     * Set the isSecurityCritical value.
     *
     * @param isSecurityCritical the isSecurityCritical value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsSecurityCritical(Boolean isSecurityCritical) {
        this.isSecurityCritical = isSecurityCritical;
        return this;
    }

    /**
     * Get the isSecuritySafeCritical value.
     *
     * @return the isSecuritySafeCritical value
     */
    public Boolean isSecuritySafeCritical() {
        return this.isSecuritySafeCritical;
    }

    /**
     * Set the isSecuritySafeCritical value.
     *
     * @param isSecuritySafeCritical the isSecuritySafeCritical value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsSecuritySafeCritical(Boolean isSecuritySafeCritical) {
        this.isSecuritySafeCritical = isSecuritySafeCritical;
        return this;
    }

    /**
     * Get the isSecurityTransparent value.
     *
     * @return the isSecurityTransparent value
     */
    public Boolean isSecurityTransparent() {
        return this.isSecurityTransparent;
    }

    /**
     * Set the isSecurityTransparent value.
     *
     * @param isSecurityTransparent the isSecurityTransparent value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsSecurityTransparent(Boolean isSecurityTransparent) {
        this.isSecurityTransparent = isSecurityTransparent;
        return this;
    }

    /**
     * Get the isPublic value.
     *
     * @return the isPublic value
     */
    public Boolean isPublic() {
        return this.isPublic;
    }

    /**
     * Set the isPublic value.
     *
     * @param isPublic the isPublic value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
        return this;
    }

    /**
     * Get the isPrivate value.
     *
     * @return the isPrivate value
     */
    public Boolean isPrivate() {
        return this.isPrivate;
    }

    /**
     * Set the isPrivate value.
     *
     * @param isPrivate the isPrivate value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
        return this;
    }

    /**
     * Get the isFamily value.
     *
     * @return the isFamily value
     */
    public Boolean isFamily() {
        return this.isFamily;
    }

    /**
     * Set the isFamily value.
     *
     * @param isFamily the isFamily value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsFamily(Boolean isFamily) {
        this.isFamily = isFamily;
        return this;
    }

    /**
     * Get the isAssembly value.
     *
     * @return the isAssembly value
     */
    public Boolean isAssembly() {
        return this.isAssembly;
    }

    /**
     * Set the isAssembly value.
     *
     * @param isAssembly the isAssembly value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsAssembly(Boolean isAssembly) {
        this.isAssembly = isAssembly;
        return this;
    }

    /**
     * Get the isFamilyAndAssembly value.
     *
     * @return the isFamilyAndAssembly value
     */
    public Boolean isFamilyAndAssembly() {
        return this.isFamilyAndAssembly;
    }

    /**
     * Set the isFamilyAndAssembly value.
     *
     * @param isFamilyAndAssembly the isFamilyAndAssembly value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsFamilyAndAssembly(Boolean isFamilyAndAssembly) {
        this.isFamilyAndAssembly = isFamilyAndAssembly;
        return this;
    }

    /**
     * Get the isFamilyOrAssembly value.
     *
     * @return the isFamilyOrAssembly value
     */
    public Boolean isFamilyOrAssembly() {
        return this.isFamilyOrAssembly;
    }

    /**
     * Set the isFamilyOrAssembly value.
     *
     * @param isFamilyOrAssembly the isFamilyOrAssembly value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsFamilyOrAssembly(Boolean isFamilyOrAssembly) {
        this.isFamilyOrAssembly = isFamilyOrAssembly;
        return this;
    }

    /**
     * Get the isStatic value.
     *
     * @return the isStatic value
     */
    public Boolean isStatic() {
        return this.isStatic;
    }

    /**
     * Set the isStatic value.
     *
     * @param isStatic the isStatic value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsStatic(Boolean isStatic) {
        this.isStatic = isStatic;
        return this;
    }

    /**
     * Get the isFinal value.
     *
     * @return the isFinal value
     */
    public Boolean isFinal() {
        return this.isFinal;
    }

    /**
     * Set the isFinal value.
     *
     * @param isFinal the isFinal value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsFinal(Boolean isFinal) {
        this.isFinal = isFinal;
        return this;
    }

    /**
     * Get the isVirtual value.
     *
     * @return the isVirtual value
     */
    public Boolean isVirtual() {
        return this.isVirtual;
    }

    /**
     * Set the isVirtual value.
     *
     * @param isVirtual the isVirtual value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsVirtual(Boolean isVirtual) {
        this.isVirtual = isVirtual;
        return this;
    }

    /**
     * Get the isHideBySig value.
     *
     * @return the isHideBySig value
     */
    public Boolean isHideBySig() {
        return this.isHideBySig;
    }

    /**
     * Set the isHideBySig value.
     *
     * @param isHideBySig the isHideBySig value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsHideBySig(Boolean isHideBySig) {
        this.isHideBySig = isHideBySig;
        return this;
    }

    /**
     * Get the isAbstract value.
     *
     * @return the isAbstract value
     */
    public Boolean isAbstract() {
        return this.isAbstract;
    }

    /**
     * Set the isAbstract value.
     *
     * @param isAbstract the isAbstract value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
        return this;
    }

    /**
     * Get the isSpecialName value.
     *
     * @return the isSpecialName value
     */
    public Boolean isSpecialName() {
        return this.isSpecialName;
    }

    /**
     * Set the isSpecialName value.
     *
     * @param isSpecialName the isSpecialName value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsSpecialName(Boolean isSpecialName) {
        this.isSpecialName = isSpecialName;
        return this;
    }

    /**
     * Get the isConstructor value.
     *
     * @return the isConstructor value
     */
    public Boolean isConstructor() {
        return this.isConstructor;
    }

    /**
     * Set the isConstructor value.
     *
     * @param isConstructor the isConstructor value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withIsConstructor(Boolean isConstructor) {
        this.isConstructor = isConstructor;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the declaringType value.
     *
     * @return the declaringType value
     */
    public SystemType declaringType() {
        return this.declaringType;
    }

    /**
     * Set the declaringType value.
     *
     * @param declaringType the declaringType value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withDeclaringType(SystemType declaringType) {
        this.declaringType = declaringType;
        return this;
    }

    /**
     * Get the reflectedType value.
     *
     * @return the reflectedType value
     */
    public SystemType reflectedType() {
        return this.reflectedType;
    }

    /**
     * Set the reflectedType value.
     *
     * @param reflectedType the reflectedType value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withReflectedType(SystemType reflectedType) {
        this.reflectedType = reflectedType;
        return this;
    }

    /**
     * Get the customAttributes value.
     *
     * @return the customAttributes value
     */
    public List<SystemReflectionCustomAttributeData> customAttributes() {
        return this.customAttributes;
    }

    /**
     * Set the customAttributes value.
     *
     * @param customAttributes the customAttributes value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withCustomAttributes(List<SystemReflectionCustomAttributeData> customAttributes) {
        this.customAttributes = customAttributes;
        return this;
    }

    /**
     * Get the metadataToken value.
     *
     * @return the metadataToken value
     */
    public Integer metadataToken() {
        return this.metadataToken;
    }

    /**
     * Set the metadataToken value.
     *
     * @param metadataToken the metadataToken value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withMetadataToken(Integer metadataToken) {
        this.metadataToken = metadataToken;
        return this;
    }

    /**
     * Get the module value.
     *
     * @return the module value
     */
    public SystemReflectionModule module() {
        return this.module;
    }

    /**
     * Set the module value.
     *
     * @param module the module value to set
     * @return the SystemReflectionMethodInfo object itself.
     */
    public SystemReflectionMethodInfo withModule(SystemReflectionModule module) {
        this.module = module;
        return this;
    }

}