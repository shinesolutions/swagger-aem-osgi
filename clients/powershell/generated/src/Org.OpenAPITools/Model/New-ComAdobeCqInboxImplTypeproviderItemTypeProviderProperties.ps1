function New-ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${inboxPeriodimplPeriodtypeproviderPeriodregistrypaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${inboxPeriodimplPeriodtypeproviderPeriodlegacypaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqInboxImplTypeproviderItemTypeProviderProperties -ArgumentList @(
            ${inboxPeriodimplPeriodtypeproviderPeriodregistrypaths},
            ${inboxPeriodimplPeriodtypeproviderPeriodlegacypaths},
            ${inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodfailureitem},
            ${inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodworkitem},
            ${inboxPeriodimplPeriodtypeproviderPerioddefaulturlPeriodtask}
        )
    }
}
