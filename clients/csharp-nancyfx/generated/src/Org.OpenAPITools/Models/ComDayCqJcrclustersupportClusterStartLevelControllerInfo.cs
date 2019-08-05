using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqJcrclustersupportClusterStartLevelControllerInfo
    /// </summary>
    public sealed class ComDayCqJcrclustersupportClusterStartLevelControllerInfo:  IEquatable<ComDayCqJcrclustersupportClusterStartLevelControllerInfo>
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
        public ComDayCqJcrclustersupportClusterStartLevelControllerProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqJcrclustersupportClusterStartLevelControllerInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqJcrclustersupportClusterStartLevelControllerInfo()
        {
        }

        private ComDayCqJcrclustersupportClusterStartLevelControllerInfo(string Pid, string Title, string Description, ComDayCqJcrclustersupportClusterStartLevelControllerProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqJcrclustersupportClusterStartLevelControllerInfo.
        /// </summary>
        /// <returns>ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder</returns>
        public static ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder Builder()
        {
            return new ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder</returns>
        public ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder With()
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

        public bool Equals(ComDayCqJcrclustersupportClusterStartLevelControllerInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqJcrclustersupportClusterStartLevelControllerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerInfo</param>
        /// <param name="right">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqJcrclustersupportClusterStartLevelControllerInfo left, ComDayCqJcrclustersupportClusterStartLevelControllerInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqJcrclustersupportClusterStartLevelControllerInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerInfo</param>
        /// <param name="right">Compared (ComDayCqJcrclustersupportClusterStartLevelControllerInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqJcrclustersupportClusterStartLevelControllerInfo left, ComDayCqJcrclustersupportClusterStartLevelControllerInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqJcrclustersupportClusterStartLevelControllerInfo.
        /// </summary>
        public sealed class ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqJcrclustersupportClusterStartLevelControllerProperties _Properties;

            internal ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqJcrclustersupportClusterStartLevelControllerInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqJcrclustersupportClusterStartLevelControllerInfoBuilder Properties(ComDayCqJcrclustersupportClusterStartLevelControllerProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqJcrclustersupportClusterStartLevelControllerInfo.
            /// </summary>
            /// <returns>ComDayCqJcrclustersupportClusterStartLevelControllerInfo</returns>
            public ComDayCqJcrclustersupportClusterStartLevelControllerInfo Build()
            {
                Validate();
                return new ComDayCqJcrclustersupportClusterStartLevelControllerInfo(
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