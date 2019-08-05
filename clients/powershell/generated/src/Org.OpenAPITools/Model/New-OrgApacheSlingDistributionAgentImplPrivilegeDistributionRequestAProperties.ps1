function New-OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${name},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${jcrPrivilege}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingDistributionAgentImplPrivilegeDistributionRequestAProperties -ArgumentList @(
            ${name},
            ${jcrPrivilege}
        )
    }
}
