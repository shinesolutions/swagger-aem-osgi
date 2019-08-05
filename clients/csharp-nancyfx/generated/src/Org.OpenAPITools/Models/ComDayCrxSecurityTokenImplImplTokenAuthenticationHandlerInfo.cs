using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo
    /// </summary>
    public sealed class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo:  IEquatable<ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo>
    { 
        /// <summary>
        /// Pid
        /// </summary>
        public string Pid { get; private set; }

        /// <summary>
        /// Title
        /// </summary>
        public string Title { get; private set; }

        /// <summary>
        /// Description
        /// </summary>
        public string Description { get; private set; }

        /// <summary>
        /// Properties
        /// </summary>
        public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties Properties { get; private set; }

        /// <summary>
        /// BundleLocation
        /// </summary>
        public string BundleLocation { get; private set; }

        /// <summary>
        /// ServiceLocation
        /// </summary>
        public string ServiceLocation { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo()
        {
        }

        private ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo(string Pid, string Title, string Description, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder</returns>
        public static ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder Builder()
        {
            return new ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder</returns>
        public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties)
                .BundleLocation(BundleLocation)
                .ServiceLocation(ServiceLocation);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo left, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo</param>
        /// <param name="right">Compared (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo left, ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.
        /// </summary>
        public sealed class ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder Properties(ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo.
            /// </summary>
            /// <returns>ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo</returns>
            public ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo Build()
            {
                Validate();
                return new ComDayCrxSecurityTokenImplImplTokenAuthenticationHandlerInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties,
                    BundleLocation: _BundleLocation,
                    ServiceLocation: _ServiceLocation
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}