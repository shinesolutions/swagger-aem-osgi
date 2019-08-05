function New-OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${enabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${configPropertyInheritancePropertyNames}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingCaconfigImplDefDefaultConfigurationInheritanceStraProperties -ArgumentList @(
            ${enabled},
            ${configPropertyInheritancePropertyNames}
        )
    }
}
