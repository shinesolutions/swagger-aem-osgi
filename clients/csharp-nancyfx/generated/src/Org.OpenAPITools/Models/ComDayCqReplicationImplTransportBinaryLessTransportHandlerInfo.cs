using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo
    /// </summary>
    public sealed class ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo:  IEquatable<ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo>
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
        public ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo()
        {
        }

        private ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo(string Pid, string Title, string Description, ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder</returns>
        public static ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder Builder()
        {
            return new ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder</returns>
        public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder With()
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

        public bool Equals(ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo left, ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo</param>
        /// <param name="right">Compared (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo left, ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.
        /// </summary>
        public sealed class ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties _Properties;

            internal ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfoBuilder Properties(ComDayCqReplicationImplTransportBinaryLessTransportHandlerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo.
            /// </summary>
            /// <returns>ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo</returns>
            public ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo Build()
            {
                Validate();
                return new ComDayCqReplicationImplTransportBinaryLessTransportHandlerInfo(
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