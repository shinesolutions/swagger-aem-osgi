function New-ComDayCqDamCoreImplLightboxLightboxServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodpaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${slingPeriodservletPeriodmethods},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPerioddamPeriodenablePeriodanonymous}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamCoreImplLightboxLightboxServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamCoreImplLightboxLightboxServletProperties -ArgumentList @(
            ${slingPeriodservletPeriodpaths},
            ${slingPeriodservletPeriodmethods},
            ${cqPerioddamPeriodenablePeriodanonymous}
        )
    }
}
