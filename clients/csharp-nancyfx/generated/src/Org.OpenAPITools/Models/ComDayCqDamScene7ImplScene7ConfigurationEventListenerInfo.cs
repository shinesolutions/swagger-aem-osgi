using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo
    /// </summary>
    public sealed class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo:  IEquatable<ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo>
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
        public ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties Properties { get; private set; }

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
        /// Use ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo()
        {
        }

        private ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo(string Pid, string Title, string Description, ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties Properties, string BundleLocation, string ServiceLocation)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
            this.BundleLocation = BundleLocation;
            
            this.ServiceLocation = ServiceLocation;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder</returns>
        public static ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder Builder()
        {
            return new ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder</returns>
        public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder With()
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

        public bool Equals(ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo left, ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</param>
        /// <param name="right">Compared (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo left, ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.
        /// </summary>
        public sealed class ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties _Properties;
            private string _BundleLocation;
            private string _ServiceLocation;

            internal ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder Properties(ComDayCqDamScene7ImplScene7ConfigurationEventListenerProperties value)
            {
                _Properties = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.BundleLocation property.
            /// </summary>
            /// <param name="value">BundleLocation</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder BundleLocation(string value)
            {
                _BundleLocation = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.ServiceLocation property.
            /// </summary>
            /// <param name="value">ServiceLocation</param>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfoBuilder ServiceLocation(string value)
            {
                _ServiceLocation = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo.
            /// </summary>
            /// <returns>ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo</returns>
            public ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo Build()
            {
                Validate();
                return new ComDayCqDamScene7ImplScene7ConfigurationEventListenerInfo(
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