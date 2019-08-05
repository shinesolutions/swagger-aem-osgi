using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// AnalyticsComponentQueryCacheServiceInfo
    /// </summary>
    public sealed class AnalyticsComponentQueryCacheServiceInfo:  IEquatable<AnalyticsComponentQueryCacheServiceInfo>
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
        public AnalyticsComponentQueryCacheServiceProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use AnalyticsComponentQueryCacheServiceInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public AnalyticsComponentQueryCacheServiceInfo()
        {
        }

        private AnalyticsComponentQueryCacheServiceInfo(string Pid, string Title, string Description, AnalyticsComponentQueryCacheServiceProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of AnalyticsComponentQueryCacheServiceInfo.
        /// </summary>
        /// <returns>AnalyticsComponentQueryCacheServiceInfoBuilder</returns>
        public static AnalyticsComponentQueryCacheServiceInfoBuilder Builder()
        {
            return new AnalyticsComponentQueryCacheServiceInfoBuilder();
        }

        /// <summary>
        /// Returns AnalyticsComponentQueryCacheServiceInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>AnalyticsComponentQueryCacheServiceInfoBuilder</returns>
        public AnalyticsComponentQueryCacheServiceInfoBuilder With()
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

        public bool Equals(AnalyticsComponentQueryCacheServiceInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (AnalyticsComponentQueryCacheServiceInfo.
        /// </summary>
        /// <param name="left">Compared (AnalyticsComponentQueryCacheServiceInfo</param>
        /// <param name="right">Compared (AnalyticsComponentQueryCacheServiceInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (AnalyticsComponentQueryCacheServiceInfo left, AnalyticsComponentQueryCacheServiceInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (AnalyticsComponentQueryCacheServiceInfo.
        /// </summary>
        /// <param name="left">Compared (AnalyticsComponentQueryCacheServiceInfo</param>
        /// <param name="right">Compared (AnalyticsComponentQueryCacheServiceInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (AnalyticsComponentQueryCacheServiceInfo left, AnalyticsComponentQueryCacheServiceInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of AnalyticsComponentQueryCacheServiceInfo.
        /// </summary>
        public sealed class AnalyticsComponentQueryCacheServiceInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private AnalyticsComponentQueryCacheServiceProperties _Properties;

            internal AnalyticsComponentQueryCacheServiceInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for AnalyticsComponentQueryCacheServiceInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public AnalyticsComponentQueryCacheServiceInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for AnalyticsComponentQueryCacheServiceInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public AnalyticsComponentQueryCacheServiceInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for AnalyticsComponentQueryCacheServiceInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public AnalyticsComponentQueryCacheServiceInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for AnalyticsComponentQueryCacheServiceInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public AnalyticsComponentQueryCacheServiceInfoBuilder Properties(AnalyticsComponentQueryCacheServiceProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of AnalyticsComponentQueryCacheServiceInfo.
            /// </summary>
            /// <returns>AnalyticsComponentQueryCacheServiceInfo</returns>
            public AnalyticsComponentQueryCacheServiceInfo Build()
            {
                Validate();
                return new AnalyticsComponentQueryCacheServiceInfo(
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