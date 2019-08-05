function New-ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyArray]]
        ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredUnderscorepaths},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyBoolean]]
        ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms},
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyDropDown]]
        ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqDamMacSyncImplDAMSyncServiceImplProperties -ArgumentList @(
            ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodregisteredUnderscorepaths},
            ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodsyncPeriodrenditions},
            ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodreplicatePeriodthreadPeriodwaitPeriodms},
            ${comPeriodadobePeriodcqPerioddamPeriodmacPeriodsyncPerioddamsyncservicePeriodplatform}
        )
    }
}
