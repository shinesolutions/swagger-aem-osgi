function New-OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${references}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.OrgApacheSlingJcrRepoinitImplRepositoryInitializerProperties -ArgumentList @(
            ${references}
        )
    }
}
