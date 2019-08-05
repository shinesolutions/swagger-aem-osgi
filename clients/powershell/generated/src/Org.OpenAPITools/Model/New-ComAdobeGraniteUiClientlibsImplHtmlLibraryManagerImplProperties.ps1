function New-ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodtiming},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPerioddebugPeriodinitPeriodjs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodminify},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPerioddebug},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodgzip},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${htmllibmanagerPeriodmaxDataUriSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${htmllibmanagerPeriodmaxage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodforceCQUrlInfo},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPerioddefaultthemename},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPerioddefaultuserthemename},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPeriodclientmanager},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPeriodpathPeriodlist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPeriodexcludedPeriodpathPeriodlist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPeriodprocessorPeriodjs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPeriodprocessorPeriodcss},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPeriodlongcachePeriodpatterns},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPeriodlongcachePeriodformat},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPerioduseFileSystemOutputCache},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPeriodfileSystemOutputCacheLocation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPerioddisablePeriodreplacement}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteUiClientlibsImplHtmlLibraryManagerImplProperties -ArgumentList @(
            ${htmllibmanagerPeriodtiming},
            ${htmllibmanagerPerioddebugPeriodinitPeriodjs},
            ${htmllibmanagerPeriodminify},
            ${htmllibmanagerPerioddebug},
            ${htmllibmanagerPeriodgzip},
            ${htmllibmanagerPeriodmaxDataUriSize},
            ${htmllibmanagerPeriodmaxage},
            ${htmllibmanagerPeriodforceCQUrlInfo},
            ${htmllibmanagerPerioddefaultthemename},
            ${htmllibmanagerPerioddefaultuserthemename},
            ${htmllibmanagerPeriodclientmanager},
            ${htmllibmanagerPeriodpathPeriodlist},
            ${htmllibmanagerPeriodexcludedPeriodpathPeriodlist},
            ${htmllibmanagerPeriodprocessorPeriodjs},
            ${htmllibmanagerPeriodprocessorPeriodcss},
            ${htmllibmanagerPeriodlongcachePeriodpatterns},
            ${htmllibmanagerPeriodlongcachePeriodformat},
            ${htmllibmanagerPerioduseFileSystemOutputCache},
            ${htmllibmanagerPeriodfileSystemOutputCacheLocation},
            ${htmllibmanagerPerioddisablePeriodreplacement}
        )
    }
}
