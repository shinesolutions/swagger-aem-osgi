function New-OrgApacheSlingXssImplXSSFilterImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${policyPath}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingXssImplXSSFilterImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingXssImplXSSFilterImplProperties -ArgumentList @(
            ${policyPath}
        )
    }
}
