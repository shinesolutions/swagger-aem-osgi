function New-ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialContentFragmentsServicesImplCommunitiesFragmenProperties -ArgumentList @(
            ${cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodenabled},
            ${cqPeriodsocialPeriodcontentPeriodfragmentsPeriodservicesPeriodwaitTimeSeconds}
        )
    }
}
