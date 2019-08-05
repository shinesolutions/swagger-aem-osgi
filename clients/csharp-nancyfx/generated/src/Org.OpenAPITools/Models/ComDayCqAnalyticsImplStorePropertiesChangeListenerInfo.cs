using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo
    /// </summary>
    public sealed class ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo:  IEquatable<ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo>
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
        public ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo()
        {
        }

        private ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo(string Pid, string Title, string Description, ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.
        /// </summary>
        /// <returns>ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder</returns>
        public static ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder Builder()
        {
            return new ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder</returns>
        public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder With()
        {
            return Builder()
                .Pid(Pid)
                .Title(Title)
                .Description(Description)
                .Properties(Properties);
        }

        public override string ToString()
        {
            return this.PropertiesToString();
        }

        public override bool Equals(object obj)
        {
            return this.EqualsByProperties(obj);
        }

        public bool Equals(ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo left, ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo</param>
        /// <param name="right">Compared (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo left, ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.
        /// </summary>
        public sealed class ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties _Properties;

            internal ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfoBuilder Properties(ComDayCqAnalyticsImplStorePropertiesChangeListenerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo.
            /// </summary>
            /// <returns>ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo</returns>
            public ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo Build()
            {
                Validate();
                return new ComDayCqAnalyticsImplStorePropertiesChangeListenerInfo(
                    Pid: _Pid,
                    Title: _Title,
                    Description: _Description,
                    Properties: _Properties
                );
            }

            private void Validate()
            { 
            }
        }

        
    }
}