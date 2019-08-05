function New-ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${group2memberPeriodrelationshipPeriodoutgoing},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${group2memberPeriodexcludedPeriodoutgoing},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyString]]
        ${group2memberPeriodrelationshipPeriodincoming},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${group2memberPeriodexcludedPeriodincoming}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeGraniteSocialgraphImplSocialGraphFactoryImplProperties -ArgumentList @(
            ${group2memberPeriodrelationshipPeriodoutgoing},
            ${group2memberPeriodexcludedPeriodoutgoing},
            ${group2memberPeriodrelationshipPeriodincoming},
            ${group2memberPeriodexcludedPeriodincoming}
        )
    }
}
