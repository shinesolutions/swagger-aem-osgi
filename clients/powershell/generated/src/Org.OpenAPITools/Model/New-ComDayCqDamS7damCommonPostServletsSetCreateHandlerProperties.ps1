function New-ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodpostPeriodoperation},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${slingPeriodservletPeriodmethods}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamS7damCommonPostServletsSetCreateHandlerProperties -ArgumentList @(
            ${slingPeriodpostPeriodoperation},
            ${slingPeriodservletPeriodmethods}
        )
    }
}
