function New-OrgApacheFelixSystemreadySystemReadyMonitorProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${pollPeriodinterval}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheFelixSystemreadySystemReadyMonitorProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheFelixSystemreadySystemReadyMonitorProperties -ArgumentList @(
            ${pollPeriodinterval}
        )
    }
}
