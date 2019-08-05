function New-OrgApacheSlingJcrRepoinitRepositoryInitializerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${references},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${scripts}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrRepoinitRepositoryInitializerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrRepoinitRepositoryInitializerProperties -ArgumentList @(
            ${references},
            ${scripts}
        )
    }
}
