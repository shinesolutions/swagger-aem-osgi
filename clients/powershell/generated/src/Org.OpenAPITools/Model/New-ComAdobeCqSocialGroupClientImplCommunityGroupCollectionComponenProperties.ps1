function New-ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${groupPeriodlistingPeriodpaginationPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${groupPeriodlistingPeriodlazyloadingPeriodenable},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${pagePeriodsize},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${priority}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties -ArgumentList @(
            ${groupPeriodlistingPeriodpaginationPeriodenable},
            ${groupPeriodlistingPeriodlazyloadingPeriodenable},
            ${pagePeriodsize},
            ${priority}
        )
    }
}
