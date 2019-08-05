function New-ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${processPeriodlabel},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${extractPeriodpages}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqDamInddImplHandlerIndesignXMPHandlerProperties -ArgumentList @(
            ${processPeriodlabel},
            ${extractPeriodpages}
        )
    }
}
