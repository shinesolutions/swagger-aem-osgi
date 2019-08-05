function New-ComDayCqCommonsImplExternalizerImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${externalizerPerioddomains},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${externalizerPeriodhost},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${externalizerPeriodcontextpath},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${externalizerPeriodencodedpath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqCommonsImplExternalizerImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqCommonsImplExternalizerImplProperties -ArgumentList @(
            ${externalizerPerioddomains},
            ${externalizerPeriodhost},
            ${externalizerPeriodcontextpath},
            ${externalizerPeriodencodedpath}
        )
    }
}
