function New-ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${filepattern},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${devicePeriodgroups},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${buildPeriodpagePeriodnodes},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${buildPeriodclientPeriodlibs},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${buildPeriodcanvasPeriodcomponent}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmDesignimporterImplMobileCanvasBuilderImplProperties -ArgumentList @(
            ${filepattern},
            ${devicePeriodgroups},
            ${buildPeriodpagePeriodnodes},
            ${buildPeriodclientPeriodlibs},
            ${buildPeriodcanvasPeriodcomponent}
        )
    }
}
