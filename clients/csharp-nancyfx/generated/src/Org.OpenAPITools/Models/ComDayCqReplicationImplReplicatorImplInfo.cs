using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplReplicatorImplInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplReplicatorImplInfo:  IEquatable<ComDayCqReplicationImplReplicatorImplInfo>
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
        public ComDayCqReplicationImplReplicatorImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplReplicatorImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplReplicatorImplInfo()
        {
        }

        private ComDayCqReplicationImplReplicatorImplInfo(string Pid, string Title, string Description, ComDayCqReplicationImplReplicatorImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplReplicatorImplInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicatorImplInfoBuilder</returns>
        public static ComDayCqReplicationImplReplicatorImplInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplReplicatorImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplReplicatorImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplReplicatorImplInfoBuilder</returns>
        public ComDayCqReplicationImplReplicatorImplInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplReplicatorImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplReplicatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicatorImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicatorImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplReplicatorImplInfo left, ComDayCqReplicationImplReplicatorImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplReplicatorImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplReplicatorImplInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplReplicatorImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplReplicatorImplInfo left, ComDayCqReplicationImplReplicatorImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplReplicatorImplInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplReplicatorImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplReplicatorImplProperties _Properties;

            internal ComDayCqReplicationImplReplicatorImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicatorImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplReplicatorImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicatorImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplReplicatorImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicatorImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplReplicatorImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplReplicatorImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplReplicatorImplInfoBuilder Properties(ComDayCqReplicationImplReplicatorImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplReplicatorImplInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplReplicatorImplInfo</returns>
            public ComDayCqReplicationImplReplicatorImplInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplReplicatorImplInfo(
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