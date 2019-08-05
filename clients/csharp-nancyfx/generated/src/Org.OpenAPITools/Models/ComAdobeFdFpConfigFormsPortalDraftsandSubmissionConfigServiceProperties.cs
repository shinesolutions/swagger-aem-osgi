using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties
    /// </summary>
    public sealed class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties:  IEquatable<ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties>
    { 
        /// <summary>
        /// PortalOutboxes
        /// </summary>
        public ConfigNodePropertyArray PortalOutboxes { get; private set; }

        /// <summary>
        /// DraftDataService
        /// </summary>
        public ConfigNodePropertyString DraftDataService { get; private set; }

        /// <summary>
        /// DraftMetadataService
        /// </summary>
        public ConfigNodePropertyString DraftMetadataService { get; private set; }

        /// <summary>
        /// SubmitDataService
        /// </summary>
        public ConfigNodePropertyString SubmitDataService { get; private set; }

        /// <summary>
        /// SubmitMetadataService
        /// </summary>
        public ConfigNodePropertyString SubmitMetadataService { get; private set; }

        /// <summary>
        /// PendingSignDataService
        /// </summary>
        public ConfigNodePropertyString PendingSignDataService { get; private set; }

        /// <summary>
        /// PendingSignMetadataService
        /// </summary>
        public ConfigNodePropertyString PendingSignMetadataService { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties()
        {
        }

        private ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(ConfigNodePropertyArray PortalOutboxes, ConfigNodePropertyString DraftDataService, ConfigNodePropertyString DraftMetadataService, ConfigNodePropertyString SubmitDataService, ConfigNodePropertyString SubmitMetadataService, ConfigNodePropertyString PendingSignDataService, ConfigNodePropertyString PendingSignMetadataService)
        {
            
            this.PortalOutboxes = PortalOutboxes;
            
            this.DraftDataService = DraftDataService;
            
            this.DraftMetadataService = DraftMetadataService;
            
            this.SubmitDataService = SubmitDataService;
            
            this.SubmitMetadataService = SubmitMetadataService;
            
            this.PendingSignDataService = PendingSignDataService;
            
            this.PendingSignMetadataService = PendingSignMetadataService;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder</returns>
        public static ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder Builder()
        {
            return new ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder();
        }

        /// <summary>
        /// Returns ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder</returns>
        public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder With()
        {
            return Builder()
                .PortalOutboxes(PortalOutboxes)
                .DraftDataService(DraftDataService)
                .DraftMetadataService(DraftMetadataService)
                .SubmitDataService(SubmitDataService)
                .SubmitMetadataService(SubmitMetadataService)
                .PendingSignDataService(PendingSignDataService)
                .PendingSignMetadataService(PendingSignMetadataService);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties left, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
        /// </summary>
        /// <param name="left">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties</param>
        /// <param name="right">Compared (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties left, ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
        /// </summary>
        public sealed class ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder
        {
            private ConfigNodePropertyArray _PortalOutboxes;
            private ConfigNodePropertyString _DraftDataService;
            private ConfigNodePropertyString _DraftMetadataService;
            private ConfigNodePropertyString _SubmitDataService;
            private ConfigNodePropertyString _SubmitMetadataService;
            private ConfigNodePropertyString _PendingSignDataService;
            private ConfigNodePropertyString _PendingSignMetadataService;

            internal ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.PortalOutboxes property.
            /// </summary>
            /// <param name="value">PortalOutboxes</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder PortalOutboxes(ConfigNodePropertyArray value)
            {
                _PortalOutboxes = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.DraftDataService property.
            /// </summary>
            /// <param name="value">DraftDataService</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder DraftDataService(ConfigNodePropertyString value)
            {
                _DraftDataService = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.DraftMetadataService property.
            /// </summary>
            /// <param name="value">DraftMetadataService</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder DraftMetadataService(ConfigNodePropertyString value)
            {
                _DraftMetadataService = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.SubmitDataService property.
            /// </summary>
            /// <param name="value">SubmitDataService</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder SubmitDataService(ConfigNodePropertyString value)
            {
                _SubmitDataService = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.SubmitMetadataService property.
            /// </summary>
            /// <param name="value">SubmitMetadataService</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder SubmitMetadataService(ConfigNodePropertyString value)
            {
                _SubmitMetadataService = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.PendingSignDataService property.
            /// </summary>
            /// <param name="value">PendingSignDataService</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder PendingSignDataService(ConfigNodePropertyString value)
            {
                _PendingSignDataService = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.PendingSignMetadataService property.
            /// </summary>
            /// <param name="value">PendingSignMetadataService</param>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServicePropertiesBuilder PendingSignMetadataService(ConfigNodePropertyString value)
            {
                _PendingSignMetadataService = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties.
            /// </summary>
            /// <returns>ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties</returns>
            public ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties Build()
            {
                Validate();
                return new ComAdobeFdFpConfigFormsPortalDraftsandSubmissionConfigServiceProperties(
                    PortalOutboxes: _PortalOutboxes,
                    DraftDataService: _DraftDataService,
                    DraftMetadataService: _DraftMetadataService,
                    SubmitDataService: _SubmitDataService,
                    SubmitMetadataService: _SubmitMetadataService,
                    PendingSignDataService: _PendingSignDataService,
                    PendingSignMetadataService: _PendingSignMetadataService
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}