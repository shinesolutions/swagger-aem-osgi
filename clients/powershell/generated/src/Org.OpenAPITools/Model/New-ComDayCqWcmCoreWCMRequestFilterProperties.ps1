function New-ComDayCqWcmCoreWCMRequestFilterProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${wcmfilterPeriodmode}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqWcmCoreWCMRequestFilterProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqWcmCoreWCMRequestFilterProperties -ArgumentList @(
            ${wcmfilterPeriodmode}
        )
    }
}
