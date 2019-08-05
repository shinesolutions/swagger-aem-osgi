function New-ComDayCqSecurityACLSetupProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${cqPeriodaclsetupPeriodrules}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqSecurityACLSetupProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqSecurityACLSetupProperties -ArgumentList @(
            ${cqPeriodaclsetupPeriodrules}
        )
    }
}
