using System;
using System.Collections.Generic;
using System.IO;
using System.Text;
using Sharpility.Extensions;
using NodaTime;

namespace Org.OpenAPITools..Models
{
    /// <summary>
    /// ComDayCqExtwidgetServletsImageSpriteServletInfo
    /// </summary>
    public sealed class ComDayCqExtwidgetServletsImageSpriteServletInfo:  IEquatable<ComDayCqExtwidgetServletsImageSpriteServletInfo>
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
        public ComDayCqExtwidgetServletsImageSpriteServletProperties Properties { get; private set; }


        /// <summary>
        /// Empty constructor required by some serializers.
        /// Use ComDayCqExtwidgetServletsImageSpriteServletInfo.Builder() for instance creation instead.
        /// </summary>
        [Obsolete]
        public ComDayCqExtwidgetServletsImageSpriteServletInfo()
        {
        }

        private ComDayCqExtwidgetServletsImageSpriteServletInfo(string Pid, string Title, string Description, ComDayCqExtwidgetServletsImageSpriteServletProperties Properties)
        {
            
            this.Pid = Pid;
            
            this.Title = Title;
            
            this.Description = Description;
            
            this.Properties = Properties;
            
        }

        /// <summary>
        /// Returns builder of ComDayCqExtwidgetServletsImageSpriteServletInfo.
        /// </summary>
        /// <returns>ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder</returns>
        public static ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder Builder()
        {
            return new ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder();
        }

        /// <summary>
        /// Returns ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder with properties set.
        /// Use it to change properties.
        /// </summary>
        /// <returns>ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder</returns>
        public ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder With()
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

        public bool Equals(ComDayCqExtwidgetServletsImageSpriteServletInfo other)
        {
            return Equals((object) other);
        }

        public override int GetHashCode()
        {
            return this.PropertiesHash();
        }

        /// <summary>
        /// Implementation of == operator for (ComDayCqExtwidgetServletsImageSpriteServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqExtwidgetServletsImageSpriteServletInfo</param>
        /// <param name="right">Compared (ComDayCqExtwidgetServletsImageSpriteServletInfo</param>
        /// <returns>true if compared items are equals, false otherwise</returns>
        public static bool operator == (ComDayCqExtwidgetServletsImageSpriteServletInfo left, ComDayCqExtwidgetServletsImageSpriteServletInfo right)
        {
            return Equals(left, right);
        }

        /// <summary>
        /// Implementation of != operator for (ComDayCqExtwidgetServletsImageSpriteServletInfo.
        /// </summary>
        /// <param name="left">Compared (ComDayCqExtwidgetServletsImageSpriteServletInfo</param>
        /// <param name="right">Compared (ComDayCqExtwidgetServletsImageSpriteServletInfo</param>
        /// <returns>true if compared items are not equals, false otherwise</returns>
        public static bool operator != (ComDayCqExtwidgetServletsImageSpriteServletInfo left, ComDayCqExtwidgetServletsImageSpriteServletInfo right)
        {
            return !Equals(left, right);
        }

        /// <summary>
        /// Builder of ComDayCqExtwidgetServletsImageSpriteServletInfo.
        /// </summary>
        public sealed class ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder
        {
            private string _Pid;
            private string _Title;
            private string _Description;
            private ComDayCqExtwidgetServletsImageSpriteServletProperties _Properties;

            internal ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder()
            {
                SetupDefaults();
            }

            private void SetupDefaults()
            {
            }

            /// <summary>
            /// Sets value for ComDayCqExtwidgetServletsImageSpriteServletInfo.Pid property.
            /// </summary>
            /// <param name="value">Pid</param>
            public ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder Pid(string value)
            {
                _Pid = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqExtwidgetServletsImageSpriteServletInfo.Title property.
            /// </summary>
            /// <param name="value">Title</param>
            public ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder Title(string value)
            {
                _Title = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqExtwidgetServletsImageSpriteServletInfo.Description property.
            /// </summary>
            /// <param name="value">Description</param>
            public ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder Description(string value)
            {
                _Description = value;
                return this;
            }

            /// <summary>
            /// Sets value for ComDayCqExtwidgetServletsImageSpriteServletInfo.Properties property.
            /// </summary>
            /// <param name="value">Properties</param>
            public ComDayCqExtwidgetServletsImageSpriteServletInfoBuilder Properties(ComDayCqExtwidgetServletsImageSpriteServletProperties value)
            {
                _Properties = value;
                return this;
            }


            /// <summary>
            /// Builds instance of ComDayCqExtwidgetServletsImageSpriteServletInfo.
            /// </summary>
            /// <returns>ComDayCqExtwidgetServletsImageSpriteServletInfo</returns>
            public ComDayCqExtwidgetServletsImageSpriteServletInfo Build()
            {
                Validate();
                return new ComDayCqExtwidgetServletsImageSpriteServletInfo(
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