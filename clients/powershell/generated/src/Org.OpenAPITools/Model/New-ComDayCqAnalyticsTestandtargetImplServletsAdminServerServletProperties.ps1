function New-ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${testandtargetPeriodendpointPeriodurl}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqAnalyticsTestandtargetImplServletsAdminServerServletProperties -ArgumentList @(
            ${testandtargetPeriodendpointPeriodurl}
        )
    }
}
