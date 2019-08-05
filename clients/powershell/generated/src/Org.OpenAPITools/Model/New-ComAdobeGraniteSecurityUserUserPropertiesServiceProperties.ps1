function New-ComAdobeGraniteSecurityUserUserPropertiesServiceProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${adapterPeriodcondition},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${granitePerioduserpropertiesPeriodnodetypes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${granitePerioduserpropertiesPeriodresourcetypes}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteSecurityUserUserPropertiesServiceProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteSecurityUserUserPropertiesServiceProperties -ArgumentList @(
            ${adapterPeriodcondition},
            ${granitePerioduserpropertiesPeriodnodetypes},
            ${granitePerioduserpropertiesPeriodresourcetypes}
        )
    }
}
