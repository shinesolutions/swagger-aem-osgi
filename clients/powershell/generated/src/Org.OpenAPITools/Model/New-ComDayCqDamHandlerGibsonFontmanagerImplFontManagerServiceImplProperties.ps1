function New-ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${eventPeriodfilter},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${fontmgrPeriodsystemPeriodfontPerioddir},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${fontmgrPeriodadobePeriodfontPerioddir},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${fontmgrPeriodcustomerPeriodfontPerioddir}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamHandlerGibsonFontmanagerImplFontManagerServiceImplProperties -ArgumentList @(
            ${eventPeriodfilter},
            ${fontmgrPeriodsystemPeriodfontPerioddir},
            ${fontmgrPeriodadobePeriodfontPerioddir},
            ${fontmgrPeriodcustomerPeriodfontPerioddir}
        )
    }
}
