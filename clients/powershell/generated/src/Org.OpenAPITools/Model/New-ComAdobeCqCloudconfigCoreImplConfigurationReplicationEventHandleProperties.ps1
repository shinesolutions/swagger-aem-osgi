function New-ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${flushPeriodagents}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqCloudconfigCoreImplConfigurationReplicationEventHandleProperties -ArgumentList @(
            ${flushPeriodagents}
        )
    }
}
