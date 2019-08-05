using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqStatisticsImplStatisticsServiceImplInfo
    /// </summary>
    public sealed class ComDayCqStatisticsImplStatisticsServiceImplInfo:  IEquatable<ComDayCqStatisticsImplStatisticsServiceImplInfo>
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
        public ComDayCqStatisticsImplStatisticsServiceImplProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqStatisticsImplStatisticsServiceImplInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqStatisticsImplStatisticsServiceImplInfo()
        {
        }

        private ComDayCqStatisticsImplStatisticsServiceImplInfo(string Pid, string Title, string Description, ComDayCqStatisticsImplStatisticsServiceImplProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqStatisticsImplStatisticsServiceImplInfo.
        /// </summary>
        /// <returns>ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder</returns>
        public static ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder Builder()
        {
            return new ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder</returns>
        public ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder With()
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

        public bool Equals(ComDayCqStatisticsImplStatisticsServiceImplInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqStatisticsImplStatisticsServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqStatisticsImplStatisticsServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqStatisticsImplStatisticsServiceImplInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqStatisticsImplStatisticsServiceImplInfo left, ComDayCqStatisticsImplStatisticsServiceImplInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqStatisticsImplStatisticsServiceImplInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqStatisticsImplStatisticsServiceImplInfo</param>
        /// <param name="right">Compared (ComDayCqStatisticsImplStatisticsServiceImplInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqStatisticsImplStatisticsServiceImplInfo left, ComDayCqStatisticsImplStatisticsServiceImplInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqStatisticsImplStatisticsServiceImplInfo.
        /// </summary>
        public sealed class ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqStatisticsImplStatisticsServiceImplProperties _Properties;

            internal ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqStatisticsImplStatisticsServiceImplInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqStatisticsImplStatisticsServiceImplInfoBuilder Properties(ComDayCqStatisticsImplStatisticsServiceImplProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqStatisticsImplStatisticsServiceImplInfo.
            /// </summary>
            /// <returns>ComDayCqStatisticsImplStatisticsServiceImplInfo</returns>
            public ComDayCqStatisticsImplStatisticsServiceImplInfo Build()
            {
                Validate();
                return new ComDayCqStatisticsImplStatisticsServiceImplInfo(
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