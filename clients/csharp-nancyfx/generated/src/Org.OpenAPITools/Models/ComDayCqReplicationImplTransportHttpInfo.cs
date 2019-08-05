using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplTransportHttpInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplTransportHttpInfo:  IEquatable<ComDayCqReplicationImplTransportHttpInfo>
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
        public ComDayCqReplicationImplTransportHttpProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplTransportHttpInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplTransportHttpInfo()
        {
        }

        private ComDayCqReplicationImplTransportHttpInfo(string Pid, string Title, string Description, ComDayCqReplicationImplTransportHttpProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplTransportHttpInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportHttpInfoBuilder</returns>
        public static ComDayCqReplicationImplTransportHttpInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplTransportHttpInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplTransportHttpInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportHttpInfoBuilder</returns>
        public ComDayCqReplicationImplTransportHttpInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplTransportHttpInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplTransportHttpInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportHttpInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportHttpInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplTransportHttpInfo left, ComDayCqReplicationImplTransportHttpInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplTransportHttpInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportHttpInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportHttpInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplTransportHttpInfo left, ComDayCqReplicationImplTransportHttpInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplTransportHttpInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplTransportHttpInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplTransportHttpProperties _Properties;

            internal ComDayCqReplicationImplTransportHttpInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportHttpInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplTransportHttpInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportHttpInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplTransportHttpInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportHttpInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplTransportHttpInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportHttpInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplTransportHttpInfoBuilder Properties(ComDayCqReplicationImplTransportHttpProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplTransportHttpInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplTransportHttpInfo</returns>
            public ComDayCqReplicationImplTransportHttpInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplTransportHttpInfo(
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