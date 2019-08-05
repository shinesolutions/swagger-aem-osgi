using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo
    /// </summary>
    public sealed class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo:  IEquatable<ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo>
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
        public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo()
        {
        }

        private ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo(string Pid, string Title, string Description, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder</returns>
        public static ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder Builder()
        {
            return new ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder();
        }

        /// <summary>
        /// Returns ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder</returns>
        public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder With()
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

        public bool Equals(ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo left, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.
        /// </summary>
        /// <param name="left">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo</param>
        /// <param name="right">Compared (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo left, ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.
        /// </summary>
        public sealed class ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties _Properties;

            internal ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfoBuilder Properties(ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo.
            /// </summary>
            /// <returns>ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo</returns>
            public ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo Build()
            {
                Validate();
                return new ComAdobeCqSocialGroupClientImplCommunityGroupCollectionComponenInfo(
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