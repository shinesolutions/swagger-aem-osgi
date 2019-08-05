function New-ComDayCqWidgetImplHtmlLibraryManagerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPeriodclientmanager},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPerioddebug},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPerioddebugPeriodconsole},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPerioddebugPeriodinitPeriodjs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPerioddefaultthemename},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPerioddefaultuserthemename},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${htmllibmanagerPeriodfirebuglitePeriodpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodforceCQUrlInfo},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodgzip},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${htmllibmanagerPeriodmaxage},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${htmllibmanagerPeriodmaxDataUriSize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodminify},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${htmllibmanagerPeriodpathPeriodlist},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${htmllibmanagerPeriodtiming}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWidgetImplHtmlLibraryManagerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWidgetImplHtmlLibraryManagerImplProperties -ArgumentList @(
            ${htmllibmanagerPeriodclientmanager},
            ${htmllibmanagerPerioddebug},
            ${htmllibmanagerPerioddebugPeriodconsole},
            ${htmllibmanagerPerioddebugPeriodinitPeriodjs},
            ${htmllibmanagerPerioddefaultthemename},
            ${htmllibmanagerPerioddefaultuserthemename},
            ${htmllibmanagerPeriodfirebuglitePeriodpath},
            ${htmllibmanagerPeriodforceCQUrlInfo},
            ${htmllibmanagerPeriodgzip},
            ${htmllibmanagerPeriodmaxage},
            ${htmllibmanagerPeriodmaxDataUriSize},
            ${htmllibmanagerPeriodminify},
            ${htmllibmanagerPeriodpathPeriodlist},
            ${htmllibmanagerPeriodtiming}
        )
    }
}
