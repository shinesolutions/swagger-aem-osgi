using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsReferenceSearchServletProperties
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsReferenceSearchServletProperties:  IEquatable<ComDayCqWcmCoreImplServletsReferenceSearchServletProperties>
    { 
        /// <summary>
        /// ReferencesearchservletMaxReferencesPerPage
        /// </summary>
        public ConfigNodePropertyInteger ReferencesearchservletMaxReferencesPerPage { get; private set; }

        /// <summary>
        /// ReferencesearchservletMaxPages
        /// </summary>
        public ConfigNodePropertyInteger ReferencesearchservletMaxPages { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties()
        {
        }

        private ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(ConfigNodePropertyInteger ReferencesearchservletMaxReferencesPerPage, ConfigNodePropertyInteger ReferencesearchservletMaxPages)
        {
            
            this.ReferencesearchservletMaxReferencesPerPage = ReferencesearchservletMaxReferencesPerPage;
            
            this.ReferencesearchservletMaxPages = ReferencesearchservletMaxPages;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder</returns>
        public static ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder</returns>
        public ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder With()
        {
            return Builder()
                .ReferencesearchservletMaxReferencesPerPage(ReferencesearchservletMaxReferencesPerPage)
                .ReferencesearchservletMaxPages(ReferencesearchservletMaxPages);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqWcmCoreImplServletsReferenceSearchServletProperties other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties left, ComDayCqWcmCoreImplServletsReferenceSearchServletProperties right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsReferenceSearchServletProperties left, ComDayCqWcmCoreImplServletsReferenceSearchServletProperties right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder
        {
            private ConfigNodePropertyInteger _ReferencesearchservletMaxReferencesPerPage;
            private ConfigNodePropertyInteger _ReferencesearchservletMaxPages;

            internal ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.ReferencesearchservletMaxReferencesPerPage property.
            /// </summary>
            /// <param name="value">ReferencesearchservletMaxReferencesPerPage</param>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder ReferencesearchservletMaxReferencesPerPage(ConfigNodePropertyInteger value)
            {
                _ReferencesearchservletMaxReferencesPerPage = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.ReferencesearchservletMaxPages property.
            /// </summary>
            /// <param name="value">ReferencesearchservletMaxPages</param>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletPropertiesBuilder ReferencesearchservletMaxPages(ConfigNodePropertyInteger value)
            {
                _ReferencesearchservletMaxPages = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsReferenceSearchServletProperties.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsReferenceSearchServletProperties</returns>
            public ComDayCqWcmCoreImplServletsReferenceSearchServletProperties Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsReferenceSearchServletProperties(
                    ReferencesearchservletMaxReferencesPerPage: _ReferencesearchservletMaxReferencesPerPage,
                    ReferencesearchservletMaxPages: _ReferencesearchservletMaxPages
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}