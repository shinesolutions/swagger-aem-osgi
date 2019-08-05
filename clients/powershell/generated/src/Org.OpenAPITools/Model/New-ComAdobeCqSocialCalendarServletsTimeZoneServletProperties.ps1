function New-ComAdobeCqSocialCalendarServletsTimeZoneServletProperties {
    [CmdletBinding()]
    Param (
        [Parameter(Position = 0, ValueFromPipelineByPropertyName = $true)]
        [System.Nullable[Org.OpenAPITools.Model.ConfigNodePropertyInteger]]
        ${timezonesPeriodexpirytime}
    )

    Process {
        'Creating object: Org.OpenAPITools.Model.ComAdobeCqSocialCalendarServletsTimeZoneServletProperties' | Write-Verbose
        $PSBoundParameters | Out-DebugParameter | Write-Debug

        New-Object -TypeName Org.OpenAPITools.Model.ComAdobeCqSocialCalendarServletsTimeZoneServletProperties -ArgumentList @(
            ${timezonesPeriodexpirytime}
        )
    }
}
