using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo
    /// </summary>
    public sealed class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo:  IEquatable<ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo>
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
        public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo()
        {
        }

        private ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo(string Pid, string Title, string Description, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.
        /// </summary>
        /// <returns>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder</returns>
        public static ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder Builder()
        {
            return new ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder</returns>
        public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder With()
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

        public bool Equals(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo left, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo</param>
        /// <param name="right">Compared (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo left, ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.
        /// </summary>
        public sealed class ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties _Properties;

            internal ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfoBuilder Properties(ComAdobeCqDamProcessorNuiImplNuiAssetProcessorProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo.
            /// </summary>
            /// <returns>ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo</returns>
            public ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo Build()
            {
                Validate();
                return new ComAdobeCqDamProcessorNuiImplNuiAssetProcessorInfo(
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