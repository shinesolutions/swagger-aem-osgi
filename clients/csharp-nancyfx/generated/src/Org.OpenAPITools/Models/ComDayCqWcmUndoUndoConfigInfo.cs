using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmUndoUndoConfigInfo
    /// </summary>
    public sealed class ComDayCqWcmUndoUndoConfigInfo:  IEquatable<ComDayCqWcmUndoUndoConfigInfo>
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
        public ComDayCqWcmUndoUndoConfigProperties Properties { get; private set; }

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
        /// Use ComDayCqWcmUndoUndoConfigInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmUndoUndoConfigInfo()
        {
        }

        private ComDayCqWcmUndoUndoConfigInfo(string Pid, string Title, string Description, ComDayCqWcmUndoUndoConfigProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmUndoUndoConfigInfo.
        /// </summary>
        /// <returns>ComDayCqWcmUndoUndoConfigInfoBuilder</returns>
        public static ComDayCqWcmUndoUndoConfigInfoBuilder Builder()
        {
            return new ComDayCqWcmUndoUndoConfigInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmUndoUndoConfigInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmUndoUndoConfigInfoBuilder</returns>
        public ComDayCqWcmUndoUndoConfigInfoBuilder With()
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

        public bool Equals(ComDayCqWcmUndoUndoConfigInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmUndoUndoConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmUndoUndoConfigInfo</param>
        /// <param name="right">Compared (ComDayCqWcmUndoUndoConfigInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmUndoUndoConfigInfo left, ComDayCqWcmUndoUndoConfigInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmUndoUndoConfigInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmUndoUndoConfigInfo</param>
        /// <param name="right">Compared (ComDayCqWcmUndoUndoConfigInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmUndoUndoConfigInfo left, ComDayCqWcmUndoUndoConfigInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmUndoUndoConfigInfo.
        /// </summary>
        public sealed class ComDayCqWcmUndoUndoConfigInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmUndoUndoConfigProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqWcmUndoUndoConfigInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmUndoUndoConfigInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmUndoUndoConfigInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmUndoUndoConfigInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmUndoUndoConfigInfoBuilder Properties(ComDayCqWcmUndoUndoConfigProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqWcmUndoUndoConfigInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmUndoUndoConfigInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqWcmUndoUndoConfigInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmUndoUndoConfigInfo.
            /// </summary>
            /// <returns>ComDayCqWcmUndoUndoConfigInfo</returns>
            public ComDayCqWcmUndoUndoConfigInfo Build()
            {
                Validate();
                return new ComDayCqWcmUndoUndoConfigInfo(
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