function New-ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${defaultPeriodexternalizerPerioddomain}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreImplVariantsPageVariantsProviderImplProperties -ArgumentList @(
            ${defaultPeriodexternalizerPerioddomain}
        )
    }
}
