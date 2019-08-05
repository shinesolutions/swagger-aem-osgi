function New-ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties {
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
        'Creating object: Org.OpenAPITools.Model.ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties -ArgumentList @(
            ${disabledPeriodcipherPeriodsuites},
            ${enabledPeriodcipherPeriodsuites}
        )
    }
}
