function New-ComDayCqReplicationImplTransportHttpProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${disabledPeriodcipherPeriodsuites},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${enabledPeriodcipherPeriodsuites}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplTransportHttpProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplTransportHttpProperties -ArgumentList @(
            ${disabledPeriodcipherPeriodsuites},
            ${enabledPeriodcipherPeriodsuites}
        )
    }
}
