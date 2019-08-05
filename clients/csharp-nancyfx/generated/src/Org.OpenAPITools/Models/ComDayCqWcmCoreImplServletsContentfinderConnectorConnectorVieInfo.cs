using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo
    /// </summary>
    public sealed class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo:  IEquatable<ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo>
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
        public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo()
        {
        }

        private ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo(string Pid, string Title, string Description, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder</returns>
        public static ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder Builder()
        {
            return new ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder</returns>
        public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder With()
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

        public bool Equals(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo left, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo</param>
        /// <param name="right">Compared (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo left, ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.
        /// </summary>
        public sealed class ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties _Properties;

            internal ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfoBuilder Properties(ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo.
            /// </summary>
            /// <returns>ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo</returns>
            public ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo Build()
            {
                Validate();
                return new ComDayCqWcmCoreImplServletsContentfinderConnectorConnectorVieInfo(
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